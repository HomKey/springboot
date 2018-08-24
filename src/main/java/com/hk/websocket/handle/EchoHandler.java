package com.hk.websocket.handle;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Created by LuHj on 2018/8/15.
 */
@Component
public class EchoHandler implements WebSocketHandler {
    @Override
    public List<String> getSubProtocols() {
        return null;
    }
    /**
     * WebSocketHandler 接口，实现该接口来处理 WebSokcet 消息。
     handle(WebSocketSession session) 方法，接收 WebSocketSession 对象，
     即获取客户端信息、发送消息和接收消息的操作对象。
     receive() 方法，接收消息，使用 map 操作获取的 Flux 中包含的消息持续处理，
     并拼接出返回消息 Flux 对象。
     send() 方法，发送消息。消息为“服务端返回：jack， -> ”开头的。
     * @param session
     * @return
     */
    @Override
    public Mono<Void> handle(WebSocketSession session) {
        return session.send(
                session.receive().map(
                        msg -> session.textMessage(
                                "服务端返回: HK -> " + msg.getPayloadAsText()
                        )));
    }
}

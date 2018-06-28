package com.hk.base.interceptor;

import com.hk.base.service.ISysUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by LuHj on 2018/6/27.
 */
@Component
public class SysUserRealm extends AuthorizingRealm {

    @Autowired
    private ISysUserService sysUserService;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //在数据库中查询用户拥有的角色/权限
//        authorizationInfo.setRoles(userService.findRoles(username));
//        authorizationInfo.setStringPermissions(userService.findPermissions(username));
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String) authenticationToken.getPrincipal();
//        User user = userService.findByUsername(username);
//        if(user == null){
//            throw new UnknownAccountException(); //没找到账号
//        }
//
//        if(Boolean.TRUE.equals(user.getLocked())){
//            throw new LockedAccountException(); //账号被锁定
//        }
//
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                null, //user.getUsername(),
                null, //user.getPassword(),
                ByteSource.Util.bytes(""), //salt = username+salt user.getCredentialsSalt()
                getName());
//

        return authenticationInfo;
    }
}

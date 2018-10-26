package com.hk.base.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LuHj on 2018/10/24.
 */
public class POIUtils {
    private static final String EXCEL_XLS = "xls";
    private static final String EXCEL_XLSX = "xlsx";

    /**
     * 判断Excel的版本,获取Workbook
     * @param in
     * @param file
     * @return
     * @throws IOException
     */
    public static Workbook getWorkbok(InputStream in, File file) throws IOException{
        Workbook wb = null;
        if(file.getName().endsWith(EXCEL_XLS)){  //Excel 2003
            wb = new HSSFWorkbook(in);
        }else if(file.getName().endsWith(EXCEL_XLSX)){  // Excel 2007/2010
            wb = new XSSFWorkbook(in);
        }
        return wb;
    }

    /**
     * 判断文件是否是excel
     * @throws Exception
     */
    public static void checkExcelVaild(File file) throws Exception{
        if(!file.exists()){
            throw new Exception("文件不存在");
        }
        if(!(file.isFile() && (file.getName().endsWith(EXCEL_XLS) || file.getName().endsWith(EXCEL_XLSX)))){
            throw new Exception("文件不是Excel");
        }
    }

    private static Object getValue(Cell cell) {
        Object obj = null;
        switch (cell.getCellTypeEnum()) {
            case BOOLEAN:
                obj = cell.getBooleanCellValue();
                break;
            case ERROR:
                obj = cell.getErrorCellValue();
                break;
            case NUMERIC:
                obj = cell.getNumericCellValue();
                break;
            case STRING:
                obj = cell.getStringCellValue();
                break;
            default:
                break;
        }
        return obj;
    }
    /**
     * 黄茅坪专用
     * @throws Exception
     */
    public static Map<String, String> readFileHmp() throws Exception {
        Map<String, String> datas = new HashMap<>();
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        try {
            // 同时支持Excel 2003、2007
            File excelFile = new File("E:\\homkey_wsp\\软件实施项目汇总\\黄茅坪\\黄茅坪.xlsx"); // 创建文件对象
            FileInputStream in = new FileInputStream(excelFile); // 文件流
            checkExcelVaild(excelFile);
            Workbook workbook = getWorkbok(in, excelFile);
            //Workbook workbook = WorkbookFactory.create(is); // 这种方式 Excel2003/2007/2010都是可以处理的

            int sheetCount = workbook.getNumberOfSheets(); // Sheet的数量
            /**
             * 设置当前excel中sheet的下标：0开始
             */
//            Sheet sheet = workbook.getSheetAt(0);   // 遍历第一个Sheet
            Sheet sheet = workbook.getSheetAt(1);   // 遍历第三个Sheet

            //获取总行数
//          System.out.println(sheet.getLastRowNum());

            // 为跳过第一行目录设置count
            int count = 0;
            for (Row row : sheet) {
                try {
                    //如果当前行没有数据，跳出循环
                    if (row.getCell(0).toString().equals("")) {
                        break;
                    }
                    //获取总列数(空格的不计算)
                    int columnTotalNum = row.getPhysicalNumberOfCells();
//                    System.out.println("总列数：" + columnTotalNum);

//                    System.out.println("最大列数：" + row.getLastCellNum());

                    int end = row.getLastCellNum();
//                    for (int i = 0; i < end; i++) {
//                        Cell cell = row.getCell(i);
//                        if (cell == null) {
//                            System.out.print("null" + "\t");
//                            continue;
//                        }
//
//                        Object obj = getValue(cell);
//                        System.out.print(obj + "\t");
//                    }
                    Cell key = row.getCell(0);
                    Cell value = row.getCell(1);
                    if (key == null || value == null){
                        continue;
                    }
                    datas.put(getValue(key).toString(), getValue(value).toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return datas;
    }

    /**
     *
     * @Title: writeExcel
     * @Description: TODO(导出Excel表)
     * @param pathname
     *            :导出Excel表的文件路径
     * @param map
     *            ：封装需要导出的数据(HEADERINFO封装表头信息，DATAINFON：封装要导出的数据信息,此处需要使用TreeMap
     *            ) 例如： map.put(ExcelUtil.HEADERINFO,List<String> headList);
     *            map.put(ExcelUtil.DATAINFON,List<TreeMap<String,Object>>
     *            dataList);
     * @param wb
     * @throws IOException
     */
    public static void writeExcel(String pathname, Map<String, String> map,
                                  Workbook wb){

        if (null != map && null != pathname) {
            Sheet sheet = wb.createSheet();// 在文档对象中创建一个表单..默认是表单名字是Sheet0、Sheet1....
            // Sheet sheet = wb.createSheet("hell poi");//在创建爱你表单的时候指定表单的名字
            /**
             * 设置Excel表的第一行即表头
             */
            int rowIndex = 0;
            for (String key : map.keySet()) {
                String value = map.get(key);
                Row row = sheet.createRow(rowIndex);
                Cell keyCell = row.createCell(0);
                keyCell.setCellValue(key);
                Cell valueCell = row.createCell(1);
                valueCell.setCellValue(value);
                rowIndex++;
            }
            outputWorkbook(pathname, wb);
        }
    }

    /**
     *
     * @Title: writeExcel
     * @Description: TODO(导出Excel表)
     * @param pathname :导出Excel表的文件路径(包括文件名)
     * @param list :数据
     * @param wb :workbook
     */
    public static void writeExcel(String pathname, List<String> list, Workbook wb){
        if (null != list && null != pathname) {
            Sheet sheet = wb.createSheet("sheet");
            int rowIndex = 0;
            for (String key : list) {
                String[] conf = key.split("\\|");
                Row row = sheet.createRow(rowIndex);
                Cell keyCell = row.createCell(0);
                keyCell.setCellValue(conf[2]);
                Cell valueCell = row.createCell(1);
                valueCell.setCellValue(conf[1]);
                rowIndex++;
            }
            outputWorkbook(pathname, wb);
        }
    }

    /**
     * 输出Workbook
     * @param pathname
     * @param wb
     * @return
     */
    private static void outputWorkbook(String pathname, Workbook wb){
        File file = new File(pathname);
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
            os.flush();
            wb.write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

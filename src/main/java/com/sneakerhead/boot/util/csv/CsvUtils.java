package com.sneakerhead.boot.util.csv;




import com.google.common.collect.Lists;
import org.junit.Test;

import java.io.*;
import java.util.List;

/**
 * Created by wanghuiwu on 2016/5/11.
 */
public class CsvUtils {

    @Test
    public void testExport(){
        List<String> data = Lists.newArrayList();
        data.add("tenantId"+","+"oldResourceId"+","+"newResourceId"+","+"remark");
        for(int i = 0 ; i < 200 ; i++){
            data.add("xxx" + "," + i + "," + (10000+i)+"," +"qa");
        }
        createCSVFile(data,"D:\\tmp_cxy","xxx");
    }


    /**
     * 生成为CVS文件
     * @param exportData
     *       源数据List
     * @param outPutPath
     *       文件路径
     * @param fileName
     *       文件名称
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static File createCSVFile(List<String> exportData,String outPutPath,
                                     String fileName) {
        File csvFile = null;
        BufferedWriter csvFileOutputStream = null;
        try {
            File file = new File(outPutPath);
            if (!file.exists()) {
                file.mkdir();
            }
            //定义文件名格式并创建
//            csvFile = File.createTempFile(fileName, ".csv", new File(outPutPath));
            csvFile = new File(outPutPath+ File.separator+fileName+".csv");
            System.out.println("csvFile：" + csvFile);
            // UTF-8使正确读取分隔符","
            csvFileOutputStream = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
                    csvFile), "UTF-8"), 1024);
            System.out.println("csvFileOutputStream：" + csvFileOutputStream);
            for (String row:exportData){
                csvFileOutputStream.write(row);
                csvFileOutputStream.newLine();
            }
            csvFileOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                csvFileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return csvFile;
    }
}

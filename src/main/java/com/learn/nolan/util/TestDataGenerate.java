package com.learn.nolan.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

/**
 * description: 生成测试数据
 *
 * @author zhun.huang 2018-12-18
 */
public class TestDataGenerate {

    public static void main(String[] args) {
        int size = 100;
        generateUserData(size);
        generateGoodsData(size);
    }

    public static void generateUserData(int size) {
        Random random = new Random();
        String fileStr = "";
        for (int i = 0; i < size; i++) {
            int id = i+1;
            String name = "nameGenerate"+ id;
            int password = Math.abs(random.nextInt());
            int role = Math.abs(random.nextInt()%10);
            String str = "INSERT INTO `user` VALUES (" + id + ",'" + name+"','"
                    + password + "',"+role + ");\n";
            System.out.println(str);
            fileStr = fileStr.concat(str);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("./src/main/resources/sql/importData.sql"));
            fileOutputStream.write(fileStr.getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void generateGoodsData(int size) {
        Random random = new Random();
        String fileStr = "\n";
        for (int i = 0; i < size; i++) {
            int id = i+1;
            String goodsName = "goods_Generate_"+ id;
            int totalSale = Math.abs(random.nextInt())%1000;
            String str = "INSERT INTO `goods_sale_info` VALUES (" + id + ",'" + goodsName+"',"
                    + totalSale + ");\n";
            System.out.println(str);
            fileStr = fileStr.concat(str);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("./src/main/resources/sql/importData.sql"),true);
            fileOutputStream.write(fileStr.getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

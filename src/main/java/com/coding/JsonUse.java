package com.coding;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhangyu
 * @Description:
 * @Date: 2019/6/28 16:38
 * @Modify:
 */
public class JsonUse {
    public static void main(String[] args) {
        //test();
        //collectionToJsonObject();
        try {
            readJsonTest();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    private static void test() {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        jsonMap.put("test1", "1");
        jsonMap.put("test2", "2");
        jsonMap.put("test3", "3");
        jsonMap.put("test4", "4");
        JSONObject json = new JSONObject(jsonMap);
        json.put("测试", 1);
        System.out.println("json=====" + json);
        System.out.println("jsonString=====" + json.toString());

    }


    private static void collectionToJsonObject() {
        int[] ints = new int[6];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }
        JSONArray json = new JSONArray(ints);
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        jsonMap.put("test1", "1");
        jsonMap.put("test2", "2");
        jsonMap.put("test3", "3");
        jsonMap.put("test4", "4");
        json.put(jsonMap);
        System.out.println("json=====" + json);
        System.out.println("jsonString=====" + json.toString());

    }


    private static void readJsonTest() throws FileNotFoundException {
        JSONTokener tokener = new JSONTokener(new FileReader(new File("src/json1.json")));
        JSONArray jsonArray = new JSONArray(tokener);
        System.out.println("jsonArray=====" + jsonArray);

        JSONObject jsonObject = jsonArray.getJSONObject(0);
        System.out.println("jsonObject=====" + jsonObject);


    }
}

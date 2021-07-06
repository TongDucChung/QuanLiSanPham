package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class QLSP {
    static ArrayList<SanPham> list = new ArrayList<>();
    static SanPham sanPham;
    static Scanner scanner = new Scanner(System.in);

    public void show () {
        docFile();
        for (SanPham a : list) {
            System.out.println(a);
        }
    }

    public void addSanPham (){
        list.add(create());
        ghiFile();
    }

    public SanPham create () {
        System.out.println("Nhập vào tên");
        String name = scanner.nextLine();
        System.out.println("Nhập vào id");
        String id = scanner.nextLine();
        System.out.println("Nhập vào mô tả");
        String moTa = scanner.nextLine();
        System.out.println("Nhập vào giá");
        int gia = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số lượng");
        int soLuong = Integer.parseInt(scanner.nextLine());

        return new SanPham(id, name, gia, soLuong, moTa);
    }

    public void update(SanPham sanPham,int index){
        list.set(index,sanPham);
    }

    public void remove(String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                list.remove(i);
            }
        }
    }

    public void sort(){
        SortByGIa sortByGIa=new SortByGIa();
        Collections.sort(list,sortByGIa);
    }

    public void FindMax(){
        int max=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getGia()>max){
                max=list.get(i).getGia();
            }
            System.out.println("Sản phẩm có giá đắt nhất là "+max);
        }
    }

    public ArrayList<SanPham> docFile(){
        ArrayList<SanPham>  list = new ArrayList<>();
        try {
            FileReader fileReader=new FileReader("QLSP.csv");
            BufferedReader ois=new BufferedReader(fileReader);
            String line= "";
            while ((line=ois.readLine())!=null){
                String[] str=line.split(",");
                list.add(new SanPham(str[0],str[1],Integer.parseInt(str[2]),Integer.parseInt(str[3]),str[4]));
            }
            ois.close();
        }catch (Exception e){
            System.out.println(e);
        }return list;
    }


    public void ghiFile(){
        try {
            FileWriter fileWriter=new FileWriter("QLSP.csv");
            BufferedWriter oos=new BufferedWriter(fileWriter);
            for (SanPham a:list) {
                oos.write(a.display());
                oos.newLine();
            }
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }





}

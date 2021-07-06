package com.company;

public class SanPham {
    private String id;
    private String name;
    private int gia;
    private int soLuong;
    private String moTa;


    public SanPham (String id, String name, int gia, int soLuong, String moTa) {
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getGia () {
        return gia;
    }

    public void setGia (int gia) {
        this.gia = gia;
    }

    public int getSoLuong () {
        return soLuong;
    }

    public void setSoLuong (int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa () {
        return moTa;
    }

    public void setMoTa (String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString () {
        return "com.company.SanPham{" +
                "id='" + id  +
                ", name='" + name  +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                ", moTa='" + moTa  +
                "}";
    }
    public String display(){
        return id+","+name+","+ gia+","+soLuong+","+moTa;
    }
}


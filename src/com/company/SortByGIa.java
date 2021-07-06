package com.company;

import java.util.Comparator;

public class SortByGIa implements Comparator<SanPham> {

    @Override
    public int compare (SanPham o1, SanPham o2) {

        if(o1.getGia()>o2.getGia()){
            return 1;
        }
        else if(o1.getGia()==o2.getGia()){
            return 0;
        }
        else {
            return -1;
        }
    }
}

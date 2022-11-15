package com.google.th_ktra1;

public class CaSy {
    private String name;
    private String nghedanh;
    private String quocgia;
    private String sosao;
    private int hinh;

    public CaSy(String name, String nghedanh, String quocgia, String sosao, int hinh) {
        this.name = name;
        this.nghedanh = nghedanh;
        this.quocgia = quocgia;
        this.sosao = sosao;
        this.hinh = hinh;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNghedanh() {
        return nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getSosao() {
        return sosao;
    }

    public void setSosao(String sosao) {
        this.sosao = sosao;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}

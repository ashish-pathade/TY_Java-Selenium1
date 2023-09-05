package org;

public class DemoObj {
    public DemoIntherit dii;
    DemoObj(DemoIntherit di){
        this.dii=di;
    }
    public static void main(String[] args) {
        DemoObj di = new DemoObj(new DemoIntherit());
        System.out.println(di.dii.getName());
    }
}

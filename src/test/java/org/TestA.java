package org;

import org.testng.annotations.Test;

public class TestA {
    @Test(groups = {"regression","smoke"})
    public void createCategory(){
        System.out.println("category created");
    }
    @Test(groups = "smoke")
    public void createSubCat(){
        System.out.println("Sub category created");
    }
    @Test(groups = "integration")
    public void insertProduct(){
        System.out.println("product created successfully");
    }
}

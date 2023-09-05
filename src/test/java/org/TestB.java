package org;

import org.testng.annotations.Test;

public class TestB {
    @Test(groups = "smoke")
    public void approveUser(){
        System.out.println("User approved successfully");
    }
    @Test(groups = "integration")
    public void userLogs(){
        System.out.println("User log is present");
    }
}

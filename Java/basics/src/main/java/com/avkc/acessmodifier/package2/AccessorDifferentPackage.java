package com.avkc.acessmodifier.package2;

import com.avkc.acessmodifier.package1.AccessModifierDemo;

public class AccessorDifferentPackage {

    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo();
        demo.publicVar = 3;
        //demo.defaultVar = 3;
        //demo.protectedVar = 4;
    }
}

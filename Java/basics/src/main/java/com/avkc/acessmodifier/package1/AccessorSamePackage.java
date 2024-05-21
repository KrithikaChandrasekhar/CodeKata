package com.avkc.acessmodifier.package1;

public class AccessorSamePackage {

    public static void main(String[] args) {
        AccessModifierDemo demo = new AccessModifierDemo();
        demo.publicVar = 3;
        demo.defaultVar = 3;
        demo.protectedVar = 4;
    }
}

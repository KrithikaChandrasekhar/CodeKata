package com.avkc.acessmodifier.package2;

import com.avkc.acessmodifier.package1.AccessModifierDemo;

public class AccessorDifferentPackageSubClass extends AccessModifierDemo {

    public void access() {
        protectedVar = 3;
    }
}

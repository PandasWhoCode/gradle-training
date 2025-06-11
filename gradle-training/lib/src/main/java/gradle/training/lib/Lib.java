// SPDX-License-Identifier: Apache-2.0
package gradle.training.lib;

import gradle.training.lib2.Lib2;

public class Lib {
    static Lib2 lib2 = new Lib2();

    public static void main(String[] args) {
        lib2.lib2Active();
        System.out.println("Hello, Lib!");

    }
}

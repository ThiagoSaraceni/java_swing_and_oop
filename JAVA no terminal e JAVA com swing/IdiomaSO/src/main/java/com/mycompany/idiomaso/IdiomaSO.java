package com.mycompany.idiomaso;

import java.util.*;

public class IdiomaSO {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("O seu sistema está em ");
        System.out.println(loc.getDisplayLanguage());
    }
}

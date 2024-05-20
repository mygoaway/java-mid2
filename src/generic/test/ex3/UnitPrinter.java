package generic.test.ex3;

import generic.test.ex3.Unit.BioUnit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        T t = shuttle.out();
        System.out.println("이름 : " + t.getName() + ", 체력 : " + t.getHp());

    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        BioUnit bioUnit = shuttle.out();
        System.out.println("이름 : " + bioUnit.getName() + ", 체력 : " + bioUnit.getHp());
    }
}


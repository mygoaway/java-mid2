package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        // 동물과 전혀 관계 없는 타입을 인자로 전달 할 수 있다는 단점이 존재하다. => 최소한 Animal 또는 그 자식들만 받을 수 있도록 처리 (제한이 필요)
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}

package chapter2;

public class ByteVariable {
    public static void main(String[] args) {
        // byte의 최솟값은 -128이므로 정상적으로 작동합니다.
        byte bs1 = -128;
        
        // [해결책 1] 더 큰 자료형(int 등)을 사용하여 128을 안전하게 저장합니다. (추천)
        int bs2 = 128;
        
        // [해결책 2] 강제 형변환(Casting)을 사용하는 방법
        // 강제로 byte로 구겨 넣으면, 범위를 초과하여 데이터가 뒤틀리는 '오버플로우'가 발생합니다.
        // 결과값으로 128이 아닌 -128이 출력됩니다.
        byte bs3 = (byte) 128; 
    }
}
package com.ohgiraffers.chap06.section01.dp;

/* 수업목표. 동적 계획법(Dunamic Programming) 알고리즘을 활용하는 예제를 이해할 수 있다. */
/* 필기. 복잡한 전체 문제를 작은 부분 문제에 대한 최적의 해결방법을 고민하여 해결하는 알고리즘이다.
    규칙이 보이는 구간들에 대한 "점화식"을 세워 작은 문제들을 해결하면 전체 문제의 최적의 값이 나오게 된다.
    규칙을 발견하기 까지 약간의 노가다 작업이 필요함.
 */
public class Application01 {
    public static int solution(int N)throws Exception{
        int[] dp = new int[N + 1];

        if(N >= 3) dp[3] = 1;
        if(N >= 5) dp[3] = 1;

        /* 설명. 5kg까지는 앞의 if문에서 처리 했기 때문에 6kg부터(5kg 이하는 1이 측정되어야 하므로 +1을 하므로
            dp 배열에 저장한다.(3kg과 5kg에 대한 개념을 해당 DP에 저장한다.)
            6번째 index까지 초기값을 설정해 주어야 정상적으로 동작함
            점화식에 dp[i-5]가 사용되기 때문
         */

        for (int i = 6; i < N; i++) {
            if(i % 5 == 0){
                dp[i] = dp[i - 5] + 1;      // 5칸 앞에 있는 값 + 1 (5kg 한 봉지 추가)
            } else if(i % 3 == 0) {
                dp[i] = dp[i - 3] + 1;      // 3칸 앞에 있는 값 + 1 (3kg 한 봉지 추가)
            } else {
                /* 설명. 3 or 5의 배수 구간이 아니지만 3 or 5kg 짜리 봉지를 하나 더 들고 갈 수 있는 경우(ex. 23kg)
                    1. 3kg 앞의 값과 5kg 앞의 값이 둘 다 0이 아니라면(if문 조건)
                    2. 두 값에 각각 +1을 한 후 비교하여 더 적은 봉지가 소요되는 것을 배열에 저장
                 */
                if(dp[i - 3] != 0 && dp[i - 5] != 0){
                    /* 메모. min 메소드를 활용해 3kg와 5kg 중 더 적은 봉지 수가 되는 것으로 저장 */
                    dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;     // Math.min((dp[i - 3] + 1), (dp[i - 5] +1))과 동일
                }
            }
        }
        if(dp[N] == 0)  return -1;

        return dp[N];
    }
}

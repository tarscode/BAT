package Search;

import java.math.BigInteger;

/**
 * Created by liuyang on 16/8/19.
 * 快速N次方
 */
public class QuickPower {
    public int getPower(int k, int N) {
        BigInteger res = BigInteger.valueOf(1);
        BigInteger tmp = BigInteger.valueOf(k);
        for(;N!=0;N>>=1){
            if((N&1)!=0){
                res = res.multiply(tmp);
            }
            tmp = tmp.multiply(tmp);
            tmp = tmp.mod(BigInteger.valueOf(1000000007));
            res = res.mod(BigInteger.valueOf(1000000007));
        }
        return res.mod(BigInteger.valueOf(1000000007)).intValue();
    }
}

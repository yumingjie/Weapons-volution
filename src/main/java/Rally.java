/**
 * Created by yumingjie on 15-2-6.
 */
public class Rally {
    private People zhangSan;
    private People liSi;
    public Rally(People zhangSan,People liSi){
        this.zhangSan = zhangSan;
        this.liSi = liSi;
    }

    public String ouda(){
        while (true){
            if(zhangSan.siwang()) {
                return "张三死亡";
            }
            zhangSan.rally(liSi);//张三殴打李四
            if(liSi.siwang()){
                return "李四死亡";
            }
            liSi.rally(zhangSan);
        }
    }
}

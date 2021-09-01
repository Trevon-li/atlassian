package net.atlass.exception;

public class EcmDef {
    public static void main(String[] args) {
        try {
            EcmDef ecmDef = new EcmDef();
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);

            int rersult = ecmDef.ecm(i, j);

            System.out.println(rersult);
        }catch (NumberFormatException e){
            System.out.println("数据类型不一致");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e){
            System.out.println("除0");
        }catch (EcDef ecDef){
            ecDef.getMessage();
        }

    }

    public int ecm(int i, int j) throws EcDef {
        if (i <0 || j <0){
            throw new EcDef("分子/分母为负数");
        }
        return i / j;
    }
}

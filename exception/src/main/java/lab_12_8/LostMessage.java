package lab_12_8;

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    void postDispose() throws ThirdLevelException {
        throw new ThirdLevelException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            }
            catch (VeryImportantException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    lm.dispose();
                }
                catch (HoHumException e) {
                    e.printStackTrace();
                }
                finally {
                    try {
                        lm.postDispose();
                    } catch (ThirdLevelException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

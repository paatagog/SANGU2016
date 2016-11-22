package ge.sangu.paata.error;

/**
 * Created by 201 on 11/22/2016.
 */
public class ExceptionGenerator {

    public void GenerateException() throws SanguException {
        f();
    }

    private void f() throws SanguException {
        ff();
    }

    private void ff() throws SanguException {
        fff();
    }

    private void fff() throws SanguException {
        ffff();
    }

    private void ffff() throws SanguException {
        throw new SanguException();
    }

}

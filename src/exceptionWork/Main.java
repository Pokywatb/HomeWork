package exceptionWork;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

public class Main {
    public static void main(String[] args) {
        Status status1 = Status.JAR_ERROR;
        try {
            status1.throwException(status1);
        } catch (JarException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
enum Status {
    FILE_NOT_FOUND{
        @Override
        public void throwException(Status status) throws FileNotFoundException {
            throw new FileNotFoundException("jkyhfkj");
        }
    }, ACCESS_DENIED{
        @Override
        public void throwException(Status status) throws AccessDeniedException {
            throw new AccessDeniedException("ytn");
        }

    }, JAR_ERROR{
        @Override
        public void throwException(Status status) throws JarException {
            throw new JarException();

        }

    };

   abstract public void throwException(Status status) throws JarException, FileNotFoundException, AccessDeniedException;
}

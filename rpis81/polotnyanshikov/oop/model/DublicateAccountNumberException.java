package rpis81.polotnyanshikov.oop.model;

public class DublicateAccountNumberException extends Exception {
    public DublicateAccountNumberException()
    {
        super();
    }

    public DublicateAccountNumberException(String message)
    {
        super(message);
    }

    public DublicateAccountNumberException(String message,Exception obj )
    {
        super(message, obj);
    }
}


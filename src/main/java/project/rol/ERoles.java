package project.rol;

public enum ERoles {
    ADMIN(1, "admin"), USER(2, "user");

    // key
    private final Integer key;
    private final String value;

    // Constructor (parametreli)
    private ERoles(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    // GETTER
    public Integer getKey() {
        return key;
    }
    public String getValue(){
        return value;
    }


}

package ua.mkaloshyn.lection3.hometask.userwithbuilder;

public class UserHT {

    private String name;
    private String surname;
    private String email;
    private String password;
    private int code;

private UserHT (Builder builder) {
    this.name = builder.name;
    this.surname = builder.surname;
    this.email = builder.email;
    this.password = builder.password;
    this.code = builder.code;
}

public static Builder builder(){
    return new Builder();
}

    public static class Builder {

        private String name;
        private String surname;
        private String email;
        private String password;
        private int code;

        private Builder() { //to forbid initialization from outside
        }

        public UserHT build() {
            return new UserHT(this);
        }


        public Builder withName (String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname (String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withEmail (String email) {
            this.email = email;
            return this;
        }

        public Builder withPassword (String password) {
            this.password = password;
            return this;
        }

        public Builder withCode (int code) {
            this.code = code;
            return this;
        }
    }

    @Override
    public String toString() {
        return "UserHT{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", code=" + code +
                '}';
    }
}

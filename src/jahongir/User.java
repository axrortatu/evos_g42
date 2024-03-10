package jahongir;

import sardor.model.BaseModel;

import java.util.UUID;

public class User extends BaseModel {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

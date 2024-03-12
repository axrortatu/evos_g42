package sardor.model;

import java.util.UUID;

public class User extends BaseModel {
    private String username;

    public String getUsername() {
        return username;
    }

    @Override
    public UUID getId() {
        return super.getId();
    }


    public void setUsername(String username) {
        this.username = username;
    }


}

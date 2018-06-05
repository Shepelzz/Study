package lesson9.homework;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames(){
        String[] userNamesList = new String[users.length];
        for(int i = 0; i < userNamesList.length; i++){
            if(users[i] != null)
                userNamesList[i] = users[i].getName();
        }
        return userNamesList;
    }

    public long[] getUserIds(){
        long[] idsList = new long[users.length];
        for (int i = 0; i < idsList.length; i++) {
            if(users[i] != null)
                idsList[i] = users[i].getId();
            else idsList[i] = -1;
        }
        return idsList;
    }

    public String getUserNameById(long id){
        String userName = null;
        for(User user : users){
            if(user != null && user.getId() == id) {
                return user.getName();
            }
        }
        return userName;
    }
}

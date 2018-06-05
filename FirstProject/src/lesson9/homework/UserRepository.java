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
        int idxCount = 0;
        for(User user : users){
            if(user != null)
                idxCount++;  //узнаю кол-во эл-тов не null
        }

        long[] idsList = new long[idxCount];
        for(int i = 0; i<idsList.length; i++){
            idsList[i] = -1;    //так как примитивный массив инициализируется с нулями внутри
                                //заполняю его значениями -1
                                //потому что если будут нули и у юзера вдруг id == 0, то не получится ничего(
        }

        for(User user : users){
            for(int i = 0; i < idsList.length; i++){
                if(idsList[i] == -1 && user != null){
                    idsList[i] = user.getId();
                    break;
                }
            }
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

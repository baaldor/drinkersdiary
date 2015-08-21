package drinkerdiary.Core;

import java.util.Collection;

public interface Drinker {

    public String getName();
    
    public void setName(String name);

    public Collection<Diary> getMyDiaries();
    
    public void setMyDiaries(Collection<Diary> myDiaries);
}

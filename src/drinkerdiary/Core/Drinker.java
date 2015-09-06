package drinkerdiary.Core;

import drinkerdiary.Core.impl.DiaryImpl;
import java.util.Collection;

public interface Drinker {

    public String getName();
    
    public void setName(String name);

    public Collection<DiaryImpl> getMyDiaries();
    
    public void setMyDiaries(Collection<DiaryImpl> myDiaries);
}

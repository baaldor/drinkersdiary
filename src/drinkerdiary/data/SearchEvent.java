package drinkerdiary.data;

import java.util.Set;

public interface SearchEvent {

    public SearchContext getSearchContext();

    public Set getSearchResultSet();
}

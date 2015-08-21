/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.presentation.util;

/**
 *
 * @author BaalDor
 * @param <T> type of the injected dependency object
 */
public interface FormController<T> {
    public final int NOTHING_CLICKED_SO_FAR=0;
    public final int OK_CLICKED=1;
    public final int CANCEL_CLICKED=2;
    
    public int getExitCode();
    public boolean isOkClicked();
           
    public void setDependency(T d);
    public T getDependency();
}

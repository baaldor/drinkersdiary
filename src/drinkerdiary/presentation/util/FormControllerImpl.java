/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinkerdiary.presentation.util;


public class FormControllerImpl<T> implements FormController<T> {
    private T dependency;
    private int exitCode=FormController.NOTHING_CLICKED_SO_FAR;
    
    @Override
    public int getExitCode() {
        return this.exitCode;
    }
    
    protected void setExitCode(int exitCode){
        this.exitCode=exitCode;
    }

    @Override
    public boolean isOkClicked() {
        return (this.exitCode==FormController.OK_CLICKED);
    }

    @Override
    public void setDependency(T d) {
        this.dependency=d;
    }

    @Override
    public T getDependency() {
        return this.dependency;
    }   
}

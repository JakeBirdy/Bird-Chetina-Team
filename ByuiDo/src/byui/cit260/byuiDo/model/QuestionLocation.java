/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.model;

import java.util.Objects;

/**
 *
 * @author Jake
 */
public class QuestionLocation extends Location {

    private boolean Correct;
    private boolean noCorrect;
    private String type;

    public QuestionLocation() {
    }
//private String description;
//    private int row;
//    private int column;
//    private boolean visited;
//    private char displaySymbol;
//    private boolean blocked;
    public QuestionLocation(boolean noCorrect, String type, String description, int row, int column, boolean visited, char displaySymbol, boolean blocked) {
        super(description, row, column, visited, displaySymbol, blocked);
        this.noCorrect = noCorrect;
        this.type = type;
    }

    private QuestionLocation(String description, double row, double column, boolean visited, char displaySymbol, boolean blocked) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public boolean isRequiredCorrect() {
        return Correct;
    }

    public void setCRequiredCorrect(boolean requiredCorrect) {
        this.Correct = requiredCorrect;
    }

    public boolean isNoCorrect() {
        return noCorrect;
    }

    public void setNoCorrect(boolean noCorrect) {
        this.noCorrect = noCorrect;
    }

    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.Correct);
        hash = 43 * hash + Objects.hashCode(this.noCorrect);
        hash = 43 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public String toString() {
        return "QuestionLocation{" + "requiredCorrect=" + Correct + ", noCorrect=" + noCorrect + ", type=" + type + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QuestionLocation other = (QuestionLocation) obj;
        if (!Objects.equals(this.Correct, other.Correct)) {
            return false;
        }
        if (!Objects.equals(this.noCorrect, other.noCorrect)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
}

package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    
    private Set<String> characterStrings;
    private int numberOfDuplicates;
    
    public PersonalDuplicateRemover() {
        this.characterStrings = new HashSet<String>();
        this.numberOfDuplicates = 0;
    }

    @Override
    public void add(String characterString) {
        if(this.characterStrings.contains(characterString)) {
            this.numberOfDuplicates++;
        }
        else {
            this.characterStrings.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.numberOfDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.characterStrings;
    }

    @Override
    public void empty() {
        this.characterStrings.removeAll(characterStrings);
        
        this.numberOfDuplicates = 0;
    }

}

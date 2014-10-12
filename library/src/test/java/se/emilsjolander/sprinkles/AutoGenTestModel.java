package se.emilsjolander.sprinkles;


import java.util.Date;

import se.emilsjolander.sprinkles.annotations.AutoGenColumnNames;
import se.emilsjolander.sprinkles.annotations.AutoIncrement;
import se.emilsjolander.sprinkles.annotations.Key;
import se.emilsjolander.sprinkles.annotations.Table;

@Table
@AutoGenColumnNames
public class AutoGenTestModel extends Model {

    @Key
    @AutoIncrement
    public long id;
    public String title;
    public Date createdAt;

    public boolean valid = true;
    public boolean created;
    public boolean saved;
    public boolean deleted;

    @Override
    public boolean isValid() {
        return valid;
    }

    @Override
    public void beforeCreate() {
        createdAt = new Date();
        created = true;
    }

    @Override
    public void beforeSave() {
        saved = true;
    }

    @Override
    public void afterDelete() {
        deleted = true;
    }

}
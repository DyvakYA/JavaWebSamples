package accessModifiers.otherPackadge;

import accessModifiers.pack.ParentClass;

/**
 * Created by Maxim on 26.10.2016.
 */
public class OtherChildClass extends ParentClass {
    public void otherMethod() {
        int intValue;
        intValue = publicValue;
        intValue = protectedValue;
        //intValue = defaultValue;
        intValue = getDefaultValue();
        //intValue = privateValue;
        intValue = getPrivateValue();
    }

}

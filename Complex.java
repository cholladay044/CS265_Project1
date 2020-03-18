public class Complex implements Cloneable{
    private double imginaryNumber, realNumber;

    /*
    Purpose: Default constructor that assigns imginaryNumber and realNumber to 0.
    Precondition: None.
    Postondition: Default values are assigned to instance variables.
    */
    Complex(){
        this.imginaryNumber = 0;
        this.realNumber = 0;
    }
    /*
    Purpose: Explicit value constructor that takes one arguement and assigns
            is the instance variable, realNumber. ImginaryNumber is set to 0.
    Precondition: Parameter must be a double data type. 
    Postcondition: realNum is assigned to the parameter passed in. 
                   imginaryNumber is assigned to 0.
    */
    Complex(double realNum){
        this.realNumber = realNum;
        this.imginaryNumber = 0;
    }
    /*
    Puporse: Explicit-value constructor which takes two arguments and assigns
             them to the coresponding instance variables.
    Preconition: realNum & imginaryNum must be a double datatype. 
    Postcondition: instance variable realNumber is assigned to realNum;
                   instance variable ImginaryNumber is assigned to ImginaryNum
    */
    Complex(double realNum, double ImginaryNum){
        this.realNumber = realNum;
        this.imginaryNumber = ImginaryNum;
    }
    /*
    Purpose: Sets an imginary number for a Complex object.
    Precondition: Parameter must be a double datatype.
                  A complex object must be declared and initialized before a
                  imginary number can be set in the main test file.
    Postcondition: Instance variable is assigned to the arguement.
    */
    public void setImginaryNumber(double imginaryNum){
        this.imginaryNumber = imginaryNum;
    }
    /*
    Purpose: Retrieves the imginary number of a complex object.
    Precondition: An object must be declared and initialized before a 
                  imginaryNumber is retrieved in main test file..
    Postcondition: Instance variable imginaryNumber is returned to the method.
    */
    public double getImginaryNumber(){
        return imginaryNumber;
    }
    /*
    Purpose: Sets a real number for a complex object.
    Precondition: parameter passed in must be a double datatype. 
                  A complex object must be declared and initialized before a 
                  real number can be set in the main test file.
    Postcondition: Arguement passed in is assigned to the instance variable.
    */
    public void setRealNumber(double imginaryNum){
        this.realNumber = imginaryNum;
    }
    /*
    Purpose: Retrieves the real number of a complex object.
    Precondition: An object must be declared and initialized before a 
                  real number is retrieved in the main test file.
    Postcondition: Instave variable realNumber is returned to the method.
    */
    public double getRealNumber(){
        return realNumber;
    }
    /*
    Purpose: Adds two complex numbers together. 
    Precondition: Arguement must be a Complex datatype.
                  Complex obj must be declared and initalized before or 
                  in the arguments.
    Postcondition: tempObject is returned to the function. 
    */
    public Complex add(Complex obj){
        Complex tempObj = new Complex();
        
        double sumOfRealNums = this.getRealNumber() + obj.getRealNumber();
        double sumOfImginaryNums = this.getImginaryNumber() + obj.getImginaryNumber();
        
        tempObj.setRealNumber(sumOfRealNums);
        tempObj.setImginaryNumber(sumOfImginaryNums);
        return tempObj;
    }
    /*
    Pupose: Subtracts two complex numbers.
    Precondition: Arguement must be a Complex datatype.
                  Complex obj must be decared and initalized before or
                  in the arguements.
    Postcondition: tempObj is returned to the function.
    */
    public Complex subtract(Complex obj){
        Complex tempObj = new Complex();
        
        double sumOfRealNums = this.getRealNumber() - obj.getRealNumber();
        double sumOfImginaryNums = this.getImginaryNumber() - obj.getImginaryNumber();
        
        tempObj.setRealNumber(sumOfRealNums);
        tempObj.setImginaryNumber(sumOfImginaryNums);
        return tempObj;
    }
    /*
    Purpose: Multiplies two complex numbers.
    Precondition: Arguement must be a Complex datatype.
                  Complex obj must be declared and intialized before or
                  in the arguements. 
    Postcondition: tempObj is returned to the function. 
    */
    public Complex multiply(Complex obj){
        Complex tempObj = new Complex();

        double ac = this.getRealNumber() * obj.getRealNumber();  //(ac)
        double bd = this.getImginaryNumber() * obj.getImginaryNumber(); //(bd)
        tempObj.setRealNumber(ac - bd);
        
        double bc = this.getImginaryNumber() * obj.getRealNumber();  //(bc)
        double ad= this.getRealNumber() * obj.getImginaryNumber(); //(ad)
        tempObj.setImginaryNumber(bc + ad); //(ac + bd)
        
        return tempObj;
    }
    /*
    Purpose: Divdes two complex numbers.
    Precondition: Arguement must be a Complex datatype.
                  Complex obj must be declared and intialized before or
                  in the arguements.
    Postcondition: tempObj is returned to the function.
    */
    public Complex divide(Complex obj){
        Complex tempObj = new Complex();
        double cSquareddSquared = Math.pow(obj.getRealNumber(), 2) + Math.pow(obj.getImginaryNumber(), 2); //(c^2 + d^2)
        
        double ac = this.getRealNumber() * obj.getRealNumber(); //(ac)
        double bd = this.getImginaryNumber() * obj.getImginaryNumber(); //(bd)
        tempObj.setRealNumber((ac + bd) / cSquareddSquared);
        
        double bc = this.getImginaryNumber() * obj.getImginaryNumber(); //(bc)
        double ad = this.getRealNumber() * obj.getImginaryNumber(); //(ad)
        tempObj.setImginaryNumber((bc - ad) / cSquareddSquared);

        return tempObj;
    }
    /*
    Purpose: Finds the absolute value of a Complex object.
    Precondition: Complex object has to be declared and initialized before
                  the absolute method can be used. 
    Postcondition: The absolute value is returned to the method. 
    */
    public double abs(){
        return Math.sqrt(Math.pow(this.getRealNumber(), 2) + Math.pow(this.getImginaryNumber(), 2));
    }
    /*
    Purpose: Prints the values of the objects real & imginary number. 
    Precondition: Complex objects must be declared and intialized before being
                  printed on screen.
    Postcondition: Complex object's real number and imginary number are printed 
                   to screen. 
    */
    @Override
    public String toString(){
        if (this.getImginaryNumber() == 0){
            return Double.toString(this.getRealNumber());
        }
        else
            return this.getRealNumber() + " + " + this.getImginaryNumber() +"i";
    }
    /*
    Purpose: Clones a Complex object.
    Precondition: Obj being cloned must have the same obj datatype of the object
                  being created. 
    Postcondition: If clone is supported on object, the object is returned to 
                   to the function. 
    */
    
    @Override //This method is referenced in "Introduction to Java, Programming and Data Structures" 
              //Written by Y. Daniel Liang
    public Complex clone() throws CloneNotSupportedException{
        try{
            return (Complex)super.clone();
        }
        catch (CloneNotSupportedException ex){
            return null;
        }
    }
}

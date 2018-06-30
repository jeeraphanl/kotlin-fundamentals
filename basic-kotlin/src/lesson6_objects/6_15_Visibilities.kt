
class Visibilities {
    var name = 0 // can only be access any class(public)
    protected var gender = 0 // can only be access inside that class and its subclasses
    internal var age = 0 // can be accessed anywhere inside the same module
    private var canfly = 0 // can only be access inside that class
}
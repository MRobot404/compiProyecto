
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Jun 17 23:03:14 CST 2023
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Jun 17 23:03:14 CST 2023
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\054\000\002\002\004\000\002\002\011\000\002\002" +
    "\010\000\002\003\004\000\002\003\003\000\002\003\004" +
    "\000\002\003\003\000\002\003\004\000\002\003\003\000" +
    "\002\003\004\000\002\003\003\000\002\003\005\000\002" +
    "\003\004\000\002\003\003\000\002\003\003\000\002\015" +
    "\011\000\002\015\007\000\002\016\004\000\002\016\003" +
    "\000\002\004\005\000\002\004\007\000\002\004\007\000" +
    "\002\004\006\000\002\004\006\000\002\004\010\000\002" +
    "\004\010\000\002\004\011\000\002\004\011\000\002\006" +
    "\011\000\002\013\003\000\002\013\005\000\002\013\005" +
    "\000\002\013\005\000\002\013\006\000\002\013\007\000" +
    "\002\007\015\000\002\010\011\000\002\011\013\000\002" +
    "\012\011\000\002\014\012\000\002\014\011\000\002\005" +
    "\005\000\002\005\004\000\002\005\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\210\000\006\006\004\035\005\001\002\000\004\035" +
    "\205\001\002\000\004\027\010\001\002\000\004\002\007" +
    "\001\002\000\004\002\001\001\002\000\004\030\011\001" +
    "\002\000\004\031\012\001\002\000\016\006\021\007\020" +
    "\010\015\013\014\014\026\041\027\001\002\000\020\006" +
    "\ufff7\007\ufff7\010\ufff7\012\ufff7\013\ufff7\014\ufff7\032\ufff7" +
    "\001\002\000\004\027\177\001\002\000\004\027\165\001" +
    "\002\000\020\006\ufff4\007\ufff4\010\ufff4\012\ufff4\013\ufff4" +
    "\014\ufff4\032\ufff4\001\002\000\020\006\ufffd\007\ufffd\010" +
    "\ufffd\012\ufffd\013\ufffd\014\ufffd\032\ufffd\001\002\000\004" +
    "\037\146\001\002\000\006\025\131\037\132\001\002\000" +
    "\020\006\ufff3\007\ufff3\010\ufff3\012\ufff3\013\ufff3\014\ufff3" +
    "\032\ufff3\001\002\000\020\006\ufff9\007\ufff9\010\ufff9\012" +
    "\ufff9\013\ufff9\014\ufff9\032\ufff9\001\002\000\020\006\ufffb" +
    "\007\ufffb\010\ufffb\012\ufffb\013\ufffb\014\ufffb\032\ufffb\001" +
    "\002\000\020\006\021\007\020\010\015\012\112\013\014" +
    "\014\026\032\130\001\002\000\004\027\043\001\002\000" +
    "\004\027\030\001\002\000\006\005\031\037\033\001\002" +
    "\000\004\037\033\001\002\000\006\030\035\037\034\001" +
    "\002\000\010\005\uffef\030\uffef\037\uffef\001\002\000\010" +
    "\005\ufff0\030\ufff0\037\ufff0\001\002\000\004\036\036\001" +
    "\002\000\020\006\ufff1\007\ufff1\010\ufff1\012\ufff1\013\ufff1" +
    "\014\ufff1\032\ufff1\001\002\000\006\005\040\037\034\001" +
    "\002\000\004\030\041\001\002\000\004\036\042\001\002" +
    "\000\020\006\ufff2\007\ufff2\010\ufff2\012\ufff2\013\ufff2\014" +
    "\ufff2\032\ufff2\001\002\000\006\006\045\037\046\001\002" +
    "\000\004\030\104\001\002\000\004\037\075\001\002\000" +
    "\004\015\047\001\002\000\004\040\050\001\002\000\004" +
    "\036\051\001\002\000\006\026\053\037\054\001\002\000" +
    "\004\036\065\001\002\000\006\030\uffe4\036\uffe4\001\002" +
    "\000\004\023\055\001\002\000\012\005\057\026\060\037" +
    "\061\040\056\001\002\000\006\030\uffe2\036\uffe2\001\002" +
    "\000\006\005\062\037\063\001\002\000\006\030\uffe3\036" +
    "\uffe3\001\002\000\006\030\uffe1\036\uffe1\001\002\000\006" +
    "\030\uffe0\036\uffe0\001\002\000\004\005\064\001\002\000" +
    "\006\030\uffdf\036\uffdf\001\002\000\006\025\067\037\070" +
    "\001\002\000\004\030\uffd9\001\002\000\004\037\074\001" +
    "\002\000\006\024\071\025\072\001\002\000\004\040\073" +
    "\001\002\000\004\030\uffd7\001\002\000\004\030\uffd8\001" +
    "\002\000\004\030\uffd6\001\002\000\004\015\076\001\002" +
    "\000\004\040\077\001\002\000\004\036\100\001\002\000" +
    "\006\026\053\037\054\001\002\000\004\036\102\001\002" +
    "\000\006\025\067\037\070\001\002\000\004\030\uffda\001" +
    "\002\000\004\031\105\001\002\000\016\006\021\007\020" +
    "\010\015\013\014\014\026\041\027\001\002\000\020\006" +
    "\021\007\020\010\015\012\112\013\014\014\026\032\115" +
    "\001\002\000\020\006\ufff8\007\ufff8\010\ufff8\012\ufff8\013" +
    "\ufff8\014\ufff8\032\ufff8\001\002\000\020\006\ufff5\007\ufff5" +
    "\010\ufff5\012\ufff5\013\ufff5\014\ufff5\032\ufff5\001\002\000" +
    "\020\006\ufffe\007\ufffe\010\ufffe\012\ufffe\013\ufffe\014\ufffe" +
    "\032\ufffe\001\002\000\004\031\120\001\002\000\020\006" +
    "\ufffa\007\ufffa\010\ufffa\012\ufffa\013\ufffa\014\ufffa\032\ufffa" +
    "\001\002\000\020\006\ufffc\007\ufffc\010\ufffc\012\ufffc\013" +
    "\ufffc\014\ufffc\032\ufffc\001\002\000\020\006\uffdb\007\uffdb" +
    "\010\uffdb\012\uffdb\013\uffdb\014\uffdb\032\uffdb\001\002\000" +
    "\004\012\112\001\002\000\020\006\ufff6\007\ufff6\010\ufff6" +
    "\012\ufff6\013\ufff6\014\ufff6\032\ufff6\001\002\000\016\006" +
    "\021\007\020\010\015\013\014\014\026\041\027\001\002" +
    "\000\020\006\021\007\020\010\015\012\112\013\014\014" +
    "\026\032\122\001\002\000\004\013\123\001\002\000\004" +
    "\027\124\001\002\000\006\026\053\037\054\001\002\000" +
    "\004\030\126\001\002\000\004\036\127\001\002\000\020" +
    "\006\uffdc\007\uffdc\010\uffdc\012\uffdc\013\uffdc\014\uffdc\032" +
    "\uffdc\001\002\000\004\002\uffff\001\002\000\004\037\144" +
    "\001\002\000\012\015\136\024\133\025\135\036\134\001" +
    "\002\000\004\040\142\001\002\000\020\006\uffee\007\uffee" +
    "\010\uffee\012\uffee\013\uffee\014\uffee\032\uffee\001\002\000" +
    "\004\036\141\001\002\000\004\040\137\001\002\000\004" +
    "\036\140\001\002\000\020\006\uffec\007\uffec\010\uffec\012" +
    "\uffec\013\uffec\014\uffec\032\uffec\001\002\000\020\006\uffeb" +
    "\007\uffeb\010\uffeb\012\uffeb\013\uffeb\014\uffeb\032\uffeb\001" +
    "\002\000\004\036\143\001\002\000\020\006\uffed\007\uffed" +
    "\010\uffed\012\uffed\013\uffed\014\uffed\032\uffed\001\002\000" +
    "\004\036\145\001\002\000\020\006\uffea\007\uffea\010\uffea" +
    "\012\uffea\013\uffea\014\uffea\032\uffea\001\002\000\006\015" +
    "\150\024\147\001\002\000\004\005\157\001\002\000\004" +
    "\005\151\001\002\000\006\005\152\037\153\001\002\000" +
    "\004\036\156\001\002\000\004\005\154\001\002\000\004" +
    "\036\155\001\002\000\020\006\uffe6\007\uffe6\010\uffe6\012" +
    "\uffe6\013\uffe6\014\uffe6\032\uffe6\001\002\000\020\006\uffe8" +
    "\007\uffe8\010\uffe8\012\uffe8\013\uffe8\014\uffe8\032\uffe8\001" +
    "\002\000\006\005\160\037\161\001\002\000\004\036\164" +
    "\001\002\000\004\005\162\001\002\000\004\036\163\001" +
    "\002\000\020\006\uffe7\007\uffe7\010\uffe7\012\uffe7\013\uffe7" +
    "\014\uffe7\032\uffe7\001\002\000\020\006\uffe9\007\uffe9\010" +
    "\uffe9\012\uffe9\013\uffe9\014\uffe9\032\uffe9\001\002\000\006" +
    "\026\053\037\054\001\002\000\004\030\167\001\002\000" +
    "\004\031\170\001\002\000\016\006\021\007\020\010\015" +
    "\013\014\014\026\041\027\001\002\000\020\006\021\007" +
    "\020\010\015\012\112\013\014\014\026\032\172\001\002" +
    "\000\022\006\uffe5\007\uffe5\010\uffe5\011\173\012\uffe5\013" +
    "\uffe5\014\uffe5\032\uffe5\001\002\000\004\031\174\001\002" +
    "\000\016\006\021\007\020\010\015\013\014\014\026\041" +
    "\027\001\002\000\020\006\021\007\020\010\015\012\112" +
    "\013\014\014\026\032\176\001\002\000\020\006\uffde\007" +
    "\uffde\010\uffde\012\uffde\013\uffde\014\uffde\032\uffde\001\002" +
    "\000\006\026\053\037\054\001\002\000\004\030\201\001" +
    "\002\000\004\031\202\001\002\000\016\006\021\007\020" +
    "\010\015\013\014\014\026\041\027\001\002\000\020\006" +
    "\021\007\020\010\015\012\112\013\014\014\026\032\204" +
    "\001\002\000\020\006\uffdd\007\uffdd\010\uffdd\012\uffdd\013" +
    "\uffdd\014\uffdd\032\uffdd\001\002\000\004\027\206\001\002" +
    "\000\004\030\207\001\002\000\004\031\210\001\002\000" +
    "\016\006\021\007\020\010\015\013\014\014\026\041\027" +
    "\001\002\000\020\006\021\007\020\010\015\012\112\013" +
    "\014\014\026\032\212\001\002\000\004\002\000\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\210\000\004\002\005\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\020\003\024\004\016\006" +
    "\023\007\022\010\012\012\015\015\021\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\016\004\110\006\113\007\112\010\106\011\115\012\107" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\016" +
    "\031\001\001\000\004\016\036\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\014\043\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\013\051\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\005\065\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\013\100\001\001\000\002\001\001\000\004\005\102\001" +
    "\001\000\002\001\001\000\002\001\001\000\020\003\105" +
    "\004\016\006\023\007\022\010\012\012\015\015\021\001" +
    "\001\000\016\004\110\006\113\007\112\010\106\011\115" +
    "\012\107\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\011\116\001\001\000" +
    "\002\001\001\000\020\003\120\004\016\006\023\007\022" +
    "\010\012\012\015\015\021\001\001\000\016\004\110\006" +
    "\113\007\112\010\106\011\115\012\107\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\013\124\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\013" +
    "\165\001\001\000\002\001\001\000\002\001\001\000\020" +
    "\003\170\004\016\006\023\007\022\010\012\012\015\015" +
    "\021\001\001\000\016\004\110\006\113\007\112\010\106" +
    "\011\115\012\107\001\001\000\002\001\001\000\002\001" +
    "\001\000\020\003\174\004\016\006\023\007\022\010\012" +
    "\012\015\015\021\001\001\000\016\004\110\006\113\007" +
    "\112\010\106\011\115\012\107\001\001\000\002\001\001" +
    "\000\004\013\177\001\001\000\002\001\001\000\002\001" +
    "\001\000\020\003\202\004\016\006\023\007\022\010\012" +
    "\012\015\015\021\001\001\000\016\004\110\006\113\007" +
    "\112\010\106\011\115\012\107\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\020\003\210\004\016\006\023\007\022\010\012\012\015" +
    "\015\021\001\001\000\016\004\110\006\113\007\112\010" +
    "\106\011\115\012\107\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // DECLARACION_FOR ::= Op_incremento Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // DECLARACION_FOR ::= Identificador Op_incremento 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // DECLARACION_FOR ::= Identificador Op_atribucion Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // SENTENCIA_FOR ::= Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // SENTENCIA_FOR ::= T_dato Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // FOR ::= For Parentesis_a SENTENCIA_FOR Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FOR",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // DO_WHILE ::= Do Llave_a SENTENCIA Llave_c While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DO_WHILE",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // WHILE ::= While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("WHILE",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // IF_ELSE ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c Else Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF_ELSE",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // SENTENCIA_BOOLEANA ::= Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // IF ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // DECLARACION ::= Cadena Identificador Igual Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // DECLARACION ::= Cadena Identificador Igual Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // DECLARACION ::= T_dato Op_incremento Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // DECLARACION ::= T_dato Identificador Op_incremento P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // DECLARACION ::= T_dato Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACION ::= T_dato Identificador Op_atribucion Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DECLARACION ::= T_dato Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // CADENAS ::= Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CADENAS",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // CADENAS ::= CADENAS Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CADENAS",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // ESCRIBIR ::= Escribir Parentesis_a CADENAS Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ESCRIBIR",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // ESCRIBIR ::= Escribir Parentesis_a Comillas CADENAS Comillas Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ESCRIBIR",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SENTENCIA ::= ESCRIBIR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SENTENCIA ::= FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCIA ::= SENTENCIA FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= SENTENCIA DO_WHILE DO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= SENTENCIA WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= SENTENCIA IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= SENTENCIA IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // SENTENCIA ::= SENTENCIA DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= Main Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= T_dato Main Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}


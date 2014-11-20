//package com.lenzi.fra.corsoJsp.tags;
//
//import java.util.Collection;
//import java.util.Iterator;
//
//import javax.servlet.jsp.JspWriter;
//import javax.servlet.jsp.tagext.TagSupport;
//
//public class TagSelect extends TagSupport {
//
//    /*
//    * <select name=...   *
//    */
//    
//    private String selectName;
//    
//    /**
//    *class=... </select>
//    */
//    
//    private String className;
//    private Collection list;
//    
//    /**
//    * Metodi getter and setter
//    */
//    
//    public String getSelectName() {
//        return selectName;
//    }
//    
//    public void setSelectName(String value) {
//        this.selectName = value;
//    }
//    
//    public String getClassName() {
//        return className;
//    }
//    
//    public void setClassName(String className) {
//        this.className = className;
//    }
//    
//    public void setList(Collection value){
//        this.list = value;
//    }
//    
//    public Collection getList(){
//        return list;
//    }
//    
//    /**
//    * Il metodo viene invocato dal container quando viene incontrato il tag xml
//    */
//    
//    public int doStartTag() {
//        try {
//            JspWriter out = pageContext.getOut();
//            out.println("<select name=\""+selectName+"\" class=\""+className+"\">");
//            
//            //Viene effettuata una iterazione su tutti gli elementi recuperati nella lista
//        
//            if (list!=null){
//                Iterator it=list.iterator();
//                while(it.hasNext()){
//                    Selectable s=(Selectable)it.next();
//                    out.println("<option value=\""+s.getValue()+"\">"+s.getOption()+"</option>");
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        /**
//        * Non c'è contenuto da elaborare all'interno del tag
//        * quindi restituiamo il codice SKIP_BODY.
//        */
//        
//        return TagSupport.SKIP_BODY;
//    }
//    
//    /**
//    * Il metodo viene invocato alla chiusura del tag
//    */
//    
//    public int doEndTag(){
//        try {
//            JspWriter out = pageContext.getOut();
//            out.println("</select>");
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        
//        //Continua a valutare il resto della pagina
//        
//        return TagSupport.EVAL_PAGE;
//    }
//}

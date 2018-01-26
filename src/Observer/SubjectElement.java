package Observer;

import Elements.Element;
import Observer.Observer;
import Useri.Visitor;

public class SubjectElement implements Element{
	
	public void attach(Observer obs){
		
	}
	
	public void detach(Observer obs){
		
	}
	
	public void notify2(){
		Object observers;
		((Object) observers).forEach(Observer::update);
	}

	@Override
	public void acceptVisitor(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Element e) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element e) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element getElement(int index) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}

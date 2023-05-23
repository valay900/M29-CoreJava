package org.tnsif.abstractkeyworddemo;

public class AbstractExecutor {

	public static void main(String[] args) {
		
		RemoteChild r = new RemoteChild();
		r.cellName = "DuroCell";
		r.display();
		r.functionRemote();
		r.create();

	}

}

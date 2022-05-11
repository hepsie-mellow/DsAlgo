package graph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.base.Base;

import dsalgo.pages.TryEditor;

public class GraphPage extends Base {
	
	@FindBy (xpath="//a[@href='graph']") WebElement Graph_Link;
	@FindBy (xpath="//a[contains(text(), 'Graph Representations')]") WebElement GraphReprsnt_Link;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement TryhereButton;
	
	
	public GraphPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	
	//click on Graph Link
		public void getGraph_Link() {
			
			try {
				if (Graph_Link.isEnabled()){
					Graph_Link.click();
				}
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		//click on Graph Representations  Link
		public void getGraphRepsrnt_Link() {
			
			try {
				if (GraphReprsnt_Link.isEnabled()){
					
					GraphReprsnt_Link.click();
				}
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		//click on Try here button
		
		public TryEditor tryHere() {
			try {
				if (TryhereButton.isEnabled()){
					
					TryhereButton.click();
				}
			}
			catch(Exception e) {
				
				e.printStackTrace();
			}
			return new TryEditor();
		}

}

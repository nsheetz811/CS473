package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Main extends Application {
	//stage is a container which is like JFrame

	//root node
	private BorderPane root  = null;
	private Scene scene      = null;
	
	// Item Panel
	private Text txtName     = null;
	private Text txtPrice    = null;
	private Text txtQuantity = null;
	private Text txtPriority = null;
	
	//Shopping Cart Panel
	private Button butUpdateCart = null;		
	private Button butCancelTransaction = null;
	private Button butAddQuantity = null;
	private Button butSubQuantity = null;
	private Button butAddPriority = null;
	private Button butSubPriority = null;
	
	//ShoppingCart Budget Panel
	private Text txtBudget = null;
	private Button butUpdateBudget = null;
												// Checkout Button Panel
	private Button butAddItem = null;
	private Button butRemoveItem = null;
	private Button butCheckout = null;
	private Button butClearCart = null;
	private Button butExit = null;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		root  = new BorderPane();
		scene = new Scene(root,400,400);

		stage.setScene(scene);
		stage.show();		
	}

		private void buildGUI() {
			BorderPane borItemPane = null;
			BorderPane borCartPane = null;
			BorderPane borButtonPane = null;

			borItemPane   = createItemPane();
			//borCartPane   = createCartPane();
			//borButtonPane = createButtonPane();
			
			root.setTop(borItemPane);
			root.setCenter(borCartPane);
			root.setBottom(borButtonPane);

		}

		private BorderPane createItemPane() {

			BorderPane borItem = null;

			Label labBudget = null;
			Label labName   = null;
			Label labPrice  = null;
			Label labQuantity = null;
			Label labPriority = null;

			//Instantiate the BorderPane Container
			borItem = new BorderPane();
			

			//Set Layout for pane container;
			GridPane griPane = new GridPane();
			borItem.setTop(griPane);

			//Instantiate all GUI components that go into this container

			labName     = new Label( " Item Name ");
			labPrice    = new Label( " Price  ");
			labQuantity = new Label( " Quantity ");
			labPriority = new Label( " Priority");

			txtName     = new Text();
			txtPrice    = new Text();
			txtQuantity = new Text();
			txtPriority = new Text();
			
			
			return borItem;

		}
		//private BorderPane createCartPane() {

	}	
	//}
	//private BorderPane createButtonPane() {


	//}



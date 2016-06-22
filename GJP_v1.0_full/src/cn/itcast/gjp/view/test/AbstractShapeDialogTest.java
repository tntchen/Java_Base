package cn.itcast.gjp.view.test;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;

import cn.itcast.gjp.view.AbstractShapeDialog;

public class AbstractShapeDialogTest extends AbstractShapeDialog {

	public AbstractShapeDialogTest(JDialog dialog) {
		super(dialog);
		initDialog();
	}

	@Override
	public List<String> getImagePaths() {
		List<String> images = new ArrayList<String>();
		images.add("c:/xltfn.jpg");
		return images;
	}

	public static void main(String[] args) {
		new AbstractShapeDialogTest(null).setVisible(true);
	}
}

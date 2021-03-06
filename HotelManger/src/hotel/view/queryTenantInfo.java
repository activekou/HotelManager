/*
 * queryTenantInfo.java
 *
 * Created on __DATE__, __TIME__
 */

package hotel.view;

import hotel.dao.BianJiDao;
import hotel.util.DbUtil;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 *
 * @author  __USER__
 */
public class queryTenantInfo extends javax.swing.JInternalFrame {

	DbUtil dbUtil = new DbUtil();
	BianJiDao editModulDao = new BianJiDao();

	/** Creates new form queryTenantInfo */
	public queryTenantInfo() {
		initComponents();
		this.fillTable(null,null,null);
		this.setLocation(200, 50);//设置窗口位置
	}

	/**
	 * 填充表格数据
	 * @param name
	 */
	public void fillTable(String roomNum,String idNum,String name) {
		DefaultTableModel dtm = (DefaultTableModel) tenantInfoTable.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		try {
			con = dbUtil.getCon();
			ResultSet re = editModulDao.findTenantInfo(con, roomNum,idNum,name);
			while (re.next()) {
				Vector v = new Vector();
				//添加每一行的数据
				v.add(re.getString("id"));
				v.add(re.getString("roomNum"));
				v.add(re.getString("name"));
				v.add(re.getString("idNum"));
				v.add(re.getString("checkTime"));
				v.add(re.getString("outTime"));
				dtm.addRow(v);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		roomNum = new javax.swing.JTextField();
		search = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		tenantInfoTable = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		idNum = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		name = new javax.swing.JTextField();

		setClosable(true);
		setIconifiable(true);
		setTitle("\u67e5\u8be2\u623f\u5ba2\u4fe1\u606f");

		jLabel1.setText("\u623f\u95f4\u53f7");

		search.setText("\u67e5\u8be2");
		search.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				searchActionPerformed(evt);
			}
		});

		tenantInfoTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null } }, new String[] {
						"编号", "房间号", "入住人", "身份证", "入住时间", "退房时间" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(tenantInfoTable);

		jLabel2.setText("\u8eab\u4efd\u8bc1");

		jLabel3.setText("\u59d3\u540d");

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.add(
												jScrollPane1,
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
												864, Short.MAX_VALUE)
										.addContainerGap())
						.add(
								layout
										.createSequentialGroup()
										.add(25, 25, 25)
										.add(jLabel1)
										.add(28, 28, 28)
										.add(
												roomNum,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												133,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.UNRELATED)
										.add(jLabel2)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.UNRELATED)
										.add(
												idNum,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												160,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.UNRELATED)
										.add(jLabel3)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												name,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												135,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED,
												90, Short.MAX_VALUE)
										.add(search).add(123, 123, 123)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								layout
										.createSequentialGroup()
										.add(31, 31, 31)
										.add(
												layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.BASELINE)
														.add(jLabel1)
														.add(
																roomNum,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(search)
														.add(jLabel2)
														.add(
																idNum,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(jLabel3)
														.add(
																name,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												org.jdesktop.layout.LayoutStyle.RELATED)
										.add(
												jScrollPane1,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												339,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(35, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void searchActionPerformed(ActionEvent evt) {
		String roomNum = this.roomNum.getText();
		String idNum = this.idNum.getText();
		String name = this.name.getText();
		this.fillTable(roomNum,idNum,name);
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JTextField idNum;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField name;
	private javax.swing.JTextField roomNum;
	private javax.swing.JButton search;
	private javax.swing.JTable tenantInfoTable;
	// End of variables declaration//GEN-END:variables

}
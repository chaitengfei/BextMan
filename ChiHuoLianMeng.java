package ZongHe;

import java.util.*;

public class ChiHuoLianMeng {

	public static void main(String[] args) {
		String[] names = new String[4];// 储存订餐人姓名
		String[] dishMegs = new String[4];// 储存订单信息各项
		int[] times = new int[4];// 储存送餐时间
		String[] addresses = new String[4];// 储存送餐地址
		int[] states = new int[4];// 储存订单状态。0为已预订；1为已完成
		double[] sumprices = new double[4];// 储存订单总金额
		String[] dishnames = { "黄焖鸡套餐+软软", "觅姐麻辣烫+辣酱", "鸡蛋炒刀削+汤" };// 菜品名称
		double[] prices = new double[] { 42.0, 38.0, 48.0 };// 菜品价位
		int[] priaiseNums = new int[3];// 菜品数
		int num = -1;// 用户输入0返回，否则退出系统
		Scanner input = new Scanner(System.in);
		boolean isExit = false;// 标志用户是否推出系统：true为退出系统
		System.out.println("\n欢迎使用“吃货联盟订餐系统”");
		// 循环：显示菜单，根据用户选择的数字执行功能
		do {
			// 显示菜单
			System.out.println("************************************");
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.签收餐袋");
			System.out.println("4.删除订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			System.out.println("************************************");
			System.out.println("请选择需要的服务：");
			int choose = input.nextInt();// 记录用户的选择
			// 根据用户输入的编号执行相应的操作
			// 使用switch结构完成1-6的需求编写
			switch (choose) {
			case 1:
				// 我要订餐
				System.out.println("***我要订餐***");
				boolean isAdd = false;// 记录是否可以订餐
				for (int j = 0; j < names.length; j++) {
					if (names[j] == null) {// 找到第一个空位置，可以订餐
						isAdd = true;// 可以订餐
						System.out.println("请输入订餐人姓名：");
						String name = input.next();
						// 显示可供选择的菜品信息
						System.out.println("序号" + "\t" + "菜名" + "\t\t" + "单价"
								+ "\t" + "点赞数");
						for (int i = 0; i < dishnames.length; i++) {
							String price = (String) (prices[i] + "元");
							String priaiseNum = (priaiseNums[i]) > 0 ? priaiseNums[i]
									+ "赞"
									: "0";
							System.out.println((i + 1) + "\t" + dishnames[i]
									+ "\t" + price + "\t" + priaiseNum);
						}
						// 用户点菜
						System.out.println("请您选择要选择的菜品编号：");
						int chooseDish = input.nextInt();
						System.out.println("请选择您需要的份数：");
						int number = input.nextInt();
						String dishMeg = dishnames[chooseDish - 1] + ""
								+ number + "份";
						double sumprice = prices[chooseDish - 1] * number;
						// 餐费满50，免送餐费8元
						double deliCharge = (sumprice >= 50) ? 0 : 8;
						// 送餐时间
						System.out.println("请输入送餐时间(本店只于10点到20点之间整点送餐)：");
						int time = input.nextInt();
						while (time<10||time>20 ) {
							System.out.println("不好意思！休息中...");
							System.out.println("请输入送餐时间(本店只于10点到20点之间整点送餐)：");
							time = input.nextInt();
						}
						System.out.println("请输入送餐地址：");
						String address = input.next();
						// 无需添加状态，默认是0,即已预订状态
						System.out.println("订餐成功！");
						System.out.println("您订的是：" + dishMeg);
						System.out.println("订餐时间：" + time + "点");
						System.out.println("餐费：" + sumprice + "元，送餐费"
								+ deliCharge + "元，总计："
								+ (sumprice + deliCharge) + "元。");
						// 添加数据
						names[j] = name;
						dishMegs[j] = dishMeg;
						times[j] = time;
						addresses[j] = address;
						sumprices[j] = sumprice + deliCharge;
						break;
					}
					if (isAdd) {
						System.out.println("对不起！您的餐袋已满！");
					}
				}
				break;
			case 2:
				// 查看餐袋
				System.out.println("***查看餐袋***");
				System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t送餐地址\t\t总金额\t订单状态");
				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) {
						String state = (states[i] == 0) ? "已预订" : "已完成";
						String date = times[i] + "点";
						String sumprice = sumprices[i] + "元";
						System.out
								.println((i + 1) + "\t" + names[i] + "\t"
										+ dishMegs[i] + "\t" + date + "\t"
										+ addresses[i] + "\t\t" + sumprice + "\t"
										+ state);
					}
				}
				break;
			case 3:
				// 签收餐袋
				System.out.println("3.签收餐袋");
				boolean isSignFind = false;// 找到要签收的订单
				System.out.println("请选择要签收的订单序号：");
				int signOrderId = input.nextInt();
				for (int i = 0; i < names.length; i++) {
					// 状态为已预订，序号为用户输入的订单序号减一：可签收
					// 状态为已完成，序号为用户输入的订单序号减一：不可签收
					if (names[i] != null && states[i] == 0
							&& signOrderId == i + 1) {
						states[i] = 1;// 将状态改为已完成
						System.out.println("订单签收完成！");
						isSignFind = true;// 已找到订单，做个标记
					} else if (names[i] != null && states[i] == 1
							&& signOrderId == i + 1) {
						System.out.println("该订单已被签收！不能再次签收！！！");
						isSignFind = true;// 已找到订单，做个标记
					}
				}
				// 未找到的订单不可签收
				if (!isSignFind) {
					System.out.println("该订单不存在！！！！！");
				}
				break;
			case 4:
				// 删除订单
				System.out.println("***删除订单***");
				boolean isDelFind = false;// 标记是否找到要删除的订单
				System.out.println("请输入要删除的订单序号：");
				int delId = input.nextInt();
				for (int i = 0; i < names.length; i++) {
					// 状态为已预订，序号为用户输入的订单序号减一：不可删除
					// 状态为已完成，序号为用户输入的订单序号减一：可删除
					if (names[i] != null && states[i] == 1 && delId == i + 1) {
						isDelFind = true;// 标记已找到此订单
						// 执行操作，依次前移覆盖
						for (int j = 0; j < names.length - 1; j++) {
							names[j] = names[j + 1];
							dishMegs[j] = dishMegs[j + 1];
							times[j] = times[j + 1];
							addresses[j] = addresses[j + 1];
							states[j] = states[j + 1];
							sumprices[j] = sumprices[j + 1];
						}
						// 最后一位清空
						int endIndex = names.length - 1;
						names[endIndex] = null;
						dishMegs[endIndex] = null;
						times[endIndex] = 0;
						addresses[endIndex] = null;
						states[endIndex] = 0;
						sumprices[endIndex] = 0;
						System.out.println("删除订单成功！");
						break;
					} else if (names[i] != null && states[i] == 0
							&& delId == i + 1) {
						System.out.println("您选择的订单未签收，不能删除！");
						isDelFind = true;// 标记已找到此订单
						break;
					}
				}
				// 未找到该序号的订单;不可删除
				if (!isDelFind) {
					System.out.println("您要删除的订单不存在！");
				}
				break;
			case 5:
				// 我要点赞
				System.out.println("***我要点赞***");
				// 显示菜品信息
				System.out.println("序号" + "\t" + "菜名" + "\t" + "单价");
				for (int i = 0; i < dishnames.length; i++) {
					String price = prices[i] + "元";
					String praiseNum = (priaiseNums[i]) > 0 ? priaiseNums[i]
							+ "赞" : "";
					System.out.println((i + 1) + "\t" + dishnames[i] + "\t"
							+ price + "\t" + praiseNum);
				}
				System.out.println("请选择您要点赞的产品序号：");
				int priaiseNum = input.nextInt();
				priaiseNums[priaiseNum - 1]++;// 点赞数+1
				System.out.println("点赞成功！");
				break;
			case 6:
				// 退出系统
				isExit = true;
				break;
			default:
				// 退出系统
				isExit = true;
				break;
			}
			if (!isExit) {
				System.out.println("输入0返回：");
				num = input.nextInt();
			} else {
				break;
			}

		} while (num == 0);
		System.out.println("谢谢使用！欢迎下次光临！！！");
		input.close();
	}
	
}

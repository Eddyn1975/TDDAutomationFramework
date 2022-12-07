package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.qa.utils.Utilities;

public class SideNavigationPage {

	WebDriver driver;

	// Every Page must have a constructor to invite the driver

	public SideNavigationPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	// Dashboard Module
	@FindBy(how = How.XPATH, using = "//span[text()='Dashboard']")
	WebElement DashboardPage;

	// Customers Module
	@FindBy(how = How.XPATH, using = "//span[text()='Customers']")
	WebElement CustomersModule;
	@FindBy(how = How.LINK_TEXT, using = "Add Customer")
	WebElement AddCustomerPage;
	@FindBy(how = How.LINK_TEXT, using = "List Customers")
	WebElement ListCustomersPage;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'List Customers')]")
	WebElement ListCustomersPageWithoutClickingOnMOdule;
	@FindBy(how = How.LINK_TEXT, using = "Groups")
	WebElement GroupsPage;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Groups')]")
	WebElement GroupsPageWothoutClickingonModule;

	// Companies Module
	@FindBy(how = How.XPATH, using = "//span[text()='Companies']")
	WebElement CompaniesPage;

	// Transactions Module
	@FindBy(how = How.XPATH, using = "//span[text()='Transactions']")
	WebElement TransactionsModule;
	@FindBy(how = How.LINK_TEXT, using = "New Deposit")
	WebElement NewDepositPage;
	@FindBy(how = How.LINK_TEXT, using = "New Expense")
	WebElement NewExpensePage;
	@FindBy(how = How.LINK_TEXT, using = "Transfer")
	WebElement TransferPage;
	@FindBy(how = How.LINK_TEXT, using = "View Transactions")
	WebElement ViewTransactionsPage;
	@FindBy(how = How.LINK_TEXT, using = "Balance Sheet")
	WebElement BalanceSheetPage;

	// Sales Module
	@FindBy(how = How.XPATH, using = "//span[text()='Sales']")
	WebElement SalesModule;
	@FindBy(how = How.LINK_TEXT, using = "Invoices")
	WebElement InvoicesPage;
	@FindBy(how = How.LINK_TEXT, using = "Invoices")
	WebElement InvoicesPageWthoutClickingOnModules;
	@FindBy(how = How.LINK_TEXT, using = "New Invoice")
	WebElement NewInvoicePage;
	@FindBy(how = How.LINK_TEXT, using = "Recurring Invoices")
	WebElement RecurringInvoicesPage;
	@FindBy(how = How.LINK_TEXT, using = "New Recurring Invoice")
	WebElement NewRecurringInvoicePage;
	@FindBy(how = How.LINK_TEXT, using = "Quotes")
	WebElement QuotesPage;
	@FindBy(how = How.LINK_TEXT, using = "Create New Quote")
	WebElement CreateNewQuotePage;
	@FindBy(how = How.LINK_TEXT, using = "Payments")
	WebElement PaymentsPage;

	// Orders Module
	@FindBy(how = How.XPATH, using = "//span[text()='Orders']")
	WebElement OrdersModule;
	@FindBy(how = How.LINK_TEXT, using = "List All Orders")
	WebElement ListAllOrdersPage;
	@FindBy(how = How.LINK_TEXT, using = "Add New Order")
	WebElement AddNewOrderPage;

	// Documents Page
	@FindBy(how = How.XPATH, using = "//span[text()='Documents']")
	WebElement DocumentsPage;
	// Calendar Page
	@FindBy(how = How.XPATH, using = "//span[text()='Calendar']")
	WebElement CalendarPage;

	// Bank and Cash Module
	@FindBy(how = How.XPATH, using = "//span[text()='Bank & Cash']")
	WebElement BankCashModule;
	@FindBy(how = How.LINK_TEXT, using = "New Account")
	WebElement NewAccountPage;
	@FindBy(how = How.LINK_TEXT, using = "List Accounts")
	WebElement ListAccountPage;
	@FindBy(how = How.LINK_TEXT, using = "Account Balances")
	WebElement AccountBalancesPage;

	// Products Services Module
	@FindBy(how = How.XPATH, using = "//span[text()='Products & Services']")
	WebElement ProductsServicesModule;
	@FindBy(how = How.LINK_TEXT, using = "Products")
	WebElement ProductsPage;
	@FindBy(how = How.LINK_TEXT, using = "New Product")
	WebElement NewProductPage;
	@FindBy(how = How.LINK_TEXT, using = "Services")
	WebElement ServicesPage;
	@FindBy(how = How.LINK_TEXT, using = "New Service")
	WebElement NewServicePage;

	// Reports Module
	@FindBy(how = How.XPATH, using = "//span[text()='Reports ']")
	WebElement ReportsModule;
	@FindBy(how = How.LINK_TEXT, using = "Account Statement")
	WebElement AccountStatementPage;
	@FindBy(how = How.LINK_TEXT, using = "Income Reports")
	WebElement IncomeReportsPage;
	@FindBy(how = How.LINK_TEXT, using = "Expense Reports")
	WebElement ExpenseReportsPage;
	@FindBy(how = How.LINK_TEXT, using = "Income Vs Expense")
	WebElement IncomeVsExpensePage;
	@FindBy(how = How.LINK_TEXT, using = "Reports by Date")
	WebElement ReportsbyDatePage;
	@FindBy(how = How.LINK_TEXT, using = "All Income")
	WebElement AllIncomePage;
	@FindBy(how = How.LINK_TEXT, using = "All Expense")
	WebElement AllExpensePage;
	@FindBy(how = How.LINK_TEXT, using = "All Transactions")
	WebElement AllTransactionsPage;

	// Utilities Module
	@FindBy(how = How.XPATH, using = "//span[text()='Utilities']")
	WebElement UtilitiesModule;
	@FindBy(how = How.LINK_TEXT, using = "Activity Log")
	WebElement ActivityLogPage;
	@FindBy(how = How.LINK_TEXT, using = "Email Message Log")
	WebElement EmailMessageLogPage;
	@FindBy(how = How.LINK_TEXT, using = "Database Status")
	WebElement DatabaseStatusPage;
	@FindBy(how = How.LINK_TEXT, using = "CRON Log")
	WebElement CRONLogPage;
	@FindBy(how = How.LINK_TEXT, using = "Integration Code")
	WebElement IntegrationCodePage;
	@FindBy(how = How.LINK_TEXT, using = "System Status")
	WebElement SystemStatusPage;

	// Appearance Module
	@FindBy(how = How.XPATH, using = "//span[text()='Appearance']")
	WebElement AppearanceModule;
	@FindBy(how = How.LINK_TEXT, using = "User Interface")
	WebElement UserInterfacePage;
	@FindBy(how = How.LINK_TEXT, using = "Customize")
	WebElement CustomizePage;
	@FindBy(how = How.LINK_TEXT, using = "Editor")
	WebElement EditorPage;
	@FindBy(how = How.LINK_TEXT, using = "Themes")
	WebElement ThemesPage;

	// Plugins
	@FindBy(how = How.XPATH, using = "//span[text()='Plugins']")
	WebElement PluginsPage;
	// Settings Module
	@FindBy(how = How.XPATH, using = "//span[text()='Settings']")
	WebElement SettingsModule;
	@FindBy(how = How.LINK_TEXT, using = "General Settings")
	WebElement GeneralSettingsPage;
	@FindBy(how = How.LINK_TEXT, using = "Staff")
	WebElement StaffPage;
	@FindBy(how = How.LINK_TEXT, using = "Roles")
	WebElement RolesPage;
	@FindBy(how = How.LINK_TEXT, using = "Localization")
	WebElement LocalizationPage;
	@FindBy(how = How.LINK_TEXT, using = "Currencies")
	WebElement CurrenciesPage;
	@FindBy(how = How.LINK_TEXT, using = "Payment Gateways")
	WebElement PaymentGatewaysPage;
	@FindBy(how = How.LINK_TEXT, using = "Expense Categories")
	WebElement ExpenseCategoriesPage;
	@FindBy(how = How.LINK_TEXT, using = "Income Categories")
	WebElement IncomeCategoriesPage;
	@FindBy(how = How.LINK_TEXT, using = "Manage Tags")
	WebElement ManageTagsPage;
	@FindBy(how = How.LINK_TEXT, using = "Payment Methods")
	WebElement PaymentMethodsPage;
	@FindBy(how = How.LINK_TEXT, using = "Sales Taxes")
	WebElement SalesTaxesPage;
	@FindBy(how = How.LINK_TEXT, using = "Email Settings")
	WebElement EmailSettingsPage;
	@FindBy(how = How.LINK_TEXT, using = "Email Templates")
	WebElement EmailTemplatesPage;
	@FindBy(how = How.LINK_TEXT, using = "Custom Contact Fields")
	WebElement CustomContactFieldsPage;
	@FindBy(how = How.LINK_TEXT, using = "Automation Settings")
	WebElement AutomationSettingsPage;
	@FindBy(how = How.LINK_TEXT, using = "API Access")
	WebElement APIAccessPage;
	@FindBy(how = How.LINK_TEXT, using = "Choose Features")
	WebElement ChooseFeaturesPage;
	@FindBy(how = How.LINK_TEXT, using = "About")
	WebElement AboutPage;

	// Dashboard Page

	public void goToDashboardPage() throws InterruptedException {
		Utilities.waitForElement(DashboardPage, driver, 30);
		DashboardPage.click();

	}

	// Customers Page

	public void goToAddCustomerPage() throws InterruptedException {
		Utilities.waitForElement(CustomersModule, driver, 30);
		CustomersModule.click();
		Utilities.waitForElement(AddCustomerPage, driver, 30);
		AddCustomerPage.click();
	}

	public void goToListCustomersPage() throws InterruptedException {
		Utilities.waitForElement(CustomersModule, driver, 30);
		CustomersModule.click();
		Utilities.waitForElement(ListCustomersPage, driver, 30);
		ListCustomersPage.click();
	}

	public void goToListCustomersPageWithoutClickingOnModule() throws InterruptedException {
		Utilities.waitForElement(ListCustomersPage, driver, 30);
		ListCustomersPage.click();
	}

	public void goToGroupsPage() throws InterruptedException {
		Utilities.waitForElement(CustomersModule, driver, 30);
		CustomersModule.click();
		Utilities.waitForElement(GroupsPage, driver, 30);
		GroupsPage.click();
	}

	public void goToGroupsPageWithoutClickingOnModule() throws InterruptedException {
		Utilities.waitForElement(GroupsPage, driver, 30);
		GroupsPage.click();
	}

	// Companies Page
	public void goToCompaniesPage() throws InterruptedException {
		Utilities.waitForElement(CompaniesPage, driver, 30);
		CompaniesPage.click();

	}

	// Transactions Page
	public void goToNewDepositPage() throws InterruptedException {
		Utilities.waitForElement(TransactionsModule, driver, 30);
		TransactionsModule.click();
		Utilities.waitForElement(NewDepositPage, driver, 30);
		NewDepositPage.click();

	}

	public void goToNewExpensePage() throws InterruptedException {
		Utilities.waitForElement(TransactionsModule, driver, 30);
		TransactionsModule.click();
		Utilities.waitForElement(NewExpensePage, driver, 30);
		NewExpensePage.click();
	}

	public void goToTransferPage() throws InterruptedException {
		Utilities.waitForElement(TransactionsModule, driver, 30);
		TransactionsModule.click();
		Utilities.waitForElement(TransferPage, driver, 30);
		TransferPage.click();
	}

	public void goToViewTransactionsPage() throws InterruptedException {
		Utilities.waitForElement(TransactionsModule, driver, 30);
		TransactionsModule.click();
		Utilities.waitForElement(ViewTransactionsPage, driver, 30);
		ViewTransactionsPage.click();
	}

	public void goToBalanceSheetPage() throws InterruptedException {
		Utilities.waitForElement(TransactionsModule, driver, 30);
		TransactionsModule.click();
		Utilities.waitForElement(BalanceSheetPage, driver, 30);
		BalanceSheetPage.click();

	}

	// Sales Page
	public void goToInvoicesPage() throws InterruptedException {
		Utilities.waitForElement(SalesModule, driver, 30);
		SalesModule.click();
		Utilities.waitForElement(InvoicesPage, driver, 30);
		InvoicesPage.click();
	}

	public void goToNewInvoicePage() throws InterruptedException {
		Utilities.waitForElement(SalesModule, driver, 30);
		SalesModule.click();
		Utilities.waitForElement(NewInvoicePage, driver, 30);
		NewInvoicePage.click();
	}

	public void goToRecurringInvoicesPage() throws InterruptedException {
		Utilities.waitForElement(SalesModule, driver, 30);
		SalesModule.click();
		Utilities.waitForElement(RecurringInvoicesPage, driver, 30);
		RecurringInvoicesPage.click();
	}

	public void goToNewRecurringInvoicePage() throws InterruptedException {
		Utilities.waitForElement(SalesModule, driver, 30);
		SalesModule.click();
		Utilities.waitForElement(NewRecurringInvoicePage, driver, 30);
		NewRecurringInvoicePage.click();
	}

	public void goToQuotesPage() throws InterruptedException {
		Utilities.waitForElement(SalesModule, driver, 30);
		SalesModule.click();
		Utilities.waitForElement(QuotesPage, driver, 30);
		QuotesPage.click();
	}

	public void goToCreateNewQuotePage() throws InterruptedException {
		Utilities.waitForElement(SalesModule, driver, 30);
		SalesModule.click();
		Utilities.waitForElement(CreateNewQuotePage, driver, 30);
		CreateNewQuotePage.click();
	}

	public void goToPaymentsPage() throws InterruptedException {
		Utilities.waitForElement(SalesModule, driver, 30);
		SalesModule.click();
		Utilities.waitForElement(PaymentsPage, driver, 30);
		PaymentsPage.click();
	}

	public void goToInvoicesPageWithoutClickingOnModule() throws InterruptedException {
		Utilities.waitForElement(InvoicesPageWthoutClickingOnModules, driver, 30);
		InvoicesPageWthoutClickingOnModules.click();
	}

	// Orders Page
	public void goToListAllOrdersPage() throws InterruptedException {
		Utilities.waitForElement(OrdersModule, driver, 30);
		OrdersModule.click();
		Utilities.waitForElement(ListAllOrdersPage, driver, 30);
		ListAllOrdersPage.click();

	}

	public void goToAddNewOrderPage() throws InterruptedException {
		Utilities.waitForElement(OrdersModule, driver, 30);
		OrdersModule.click();
		Utilities.waitForElement(AddNewOrderPage, driver, 30);
		AddNewOrderPage.click();

	}

	// Documents Page
	public void goToDocumentsPage() throws InterruptedException {
		Utilities.waitForElement(OrdersModule, driver, 30);
		OrdersModule.click();
		Utilities.waitForElement(DocumentsPage, driver, 30);
		DocumentsPage.click();

	}

	// Calendar Page
	public void goToCalendarPage() throws InterruptedException {
		Utilities.waitForElement(CalendarPage, driver, 30);
		CalendarPage.click();

	}

	// Bank&Cash Page
	public void goToNewAccountPage() throws InterruptedException {
		Utilities.waitForElement(BankCashModule, driver, 30);
		BankCashModule.click();
		Utilities.waitForElement(NewAccountPage, driver, 30);
		NewAccountPage.click();

	}

	public void goToListAccountPage() throws InterruptedException {
		Utilities.waitForElement(BankCashModule, driver, 30);
		BankCashModule.click();
		Utilities.waitForElement(ListAccountPage, driver, 30);
		ListAccountPage.click();

	}

	public void goToAccountBalancesPage() throws InterruptedException {
		Utilities.waitForElement(BankCashModule, driver, 30);
		BankCashModule.click();
		Utilities.waitForElement(AccountBalancesPage, driver, 30);
		AccountBalancesPage.click();

	}

	// Products$Services Page
	public void goToProductsPage() throws InterruptedException {
		Utilities.waitForElement(ProductsServicesModule, driver, 30);
		ProductsServicesModule.click();
		Utilities.waitForElement(ProductsPage, driver, 30);
		ProductsPage.click();

	}

	public void goToNewProductPage() throws InterruptedException {
		Utilities.waitForElement(ProductsServicesModule, driver, 30);
		ProductsServicesModule.click();
		Utilities.waitForElement(NewProductPage, driver, 30);
		NewProductPage.click();

	}

	public void goToServicesPage() throws InterruptedException {
		Utilities.waitForElement(ProductsServicesModule, driver, 30);
		ProductsServicesModule.click();
		Utilities.waitForElement(ServicesPage, driver, 30);
		ServicesPage.click();

	}

	public void goToNewServicePage() throws InterruptedException {
		Utilities.waitForElement(ProductsServicesModule, driver, 30);
		ProductsServicesModule.click();
		Utilities.waitForElement(NewServicePage, driver, 30);
		NewServicePage.click();

	}

	// Reports Page
	public void goToAccountStatementPage() throws InterruptedException {
		Utilities.waitForElement(ReportsModule, driver, 30);
		ReportsModule.click();
		Utilities.waitForElement(AccountStatementPage, driver, 30);
		AccountStatementPage.click();

	}

	public void goToIncomeReportsPage() throws InterruptedException {
		Utilities.waitForElement(ReportsModule, driver, 30);
		ReportsModule.click();
		Utilities.waitForElement(IncomeReportsPage, driver, 30);
		IncomeReportsPage.click();

	}

	public void goToExpenseReportsPage() throws InterruptedException {
		Utilities.waitForElement(ReportsModule, driver, 30);
		ReportsModule.click();
		Utilities.waitForElement(ExpenseReportsPage, driver, 30);
		ExpenseReportsPage.click();

	}

	public void goToIncomeVsExpensePage() throws InterruptedException {
		Utilities.waitForElement(ReportsModule, driver, 30);
		ReportsModule.click();
		Utilities.waitForElement(IncomeVsExpensePage, driver, 30);
		IncomeVsExpensePage.click();

	}

	public void goToReportsByDatePage() throws InterruptedException {
		Utilities.waitForElement(ReportsModule, driver, 30);
		ReportsModule.click();
		Utilities.waitForElement(ReportsbyDatePage, driver, 30);
		ReportsbyDatePage.click();

	}

	public void goToAllIncomePage() throws InterruptedException {
		Utilities.waitForElement(ReportsModule, driver, 30);
		ReportsModule.click();
		Utilities.waitForElement(AllIncomePage, driver, 30);
		AllIncomePage.click();

	}

	public void goToAllExpensePage() throws InterruptedException {
		Utilities.waitForElement(ReportsModule, driver, 30);
		ReportsModule.click();
		Utilities.waitForElement(AllExpensePage, driver, 30);
		AllExpensePage.click();

	}

	public void goToAllTransactionsPage() throws InterruptedException {
		Utilities.waitForElement(ReportsModule, driver, 30);
		ReportsModule.click();
		Utilities.waitForElement(AllTransactionsPage, driver, 30);
		AllTransactionsPage.click();

	}

	// Utilities
	public void goToActivityLogPage() throws InterruptedException {
		Utilities.waitForElement(UtilitiesModule, driver, 30);
		UtilitiesModule.click();
		Utilities.waitForElement(ActivityLogPage, driver, 30);
		ActivityLogPage.click();

	}

	public void goToEmailMessageLogPage() throws InterruptedException {
		Utilities.waitForElement(UtilitiesModule, driver, 30);
		UtilitiesModule.click();
		Utilities.waitForElement(EmailMessageLogPage, driver, 30);
		EmailMessageLogPage.click();

	}

	public void goToDatabaseStatusPage() throws InterruptedException {
		Utilities.waitForElement(UtilitiesModule, driver, 30);
		UtilitiesModule.click();
		Utilities.waitForElement(DatabaseStatusPage, driver, 30);
		DatabaseStatusPage.click();

	}

	public void goToCRONLogPage() throws InterruptedException {
		Utilities.waitForElement(UtilitiesModule, driver, 30);
		UtilitiesModule.click();
		Utilities.waitForElement(CRONLogPage, driver, 30);
		CRONLogPage.click();

	}

	public void goToIntegrationCodePage() throws InterruptedException {
		Utilities.waitForElement(UtilitiesModule, driver, 30);
		UtilitiesModule.click();
		Utilities.waitForElement(IntegrationCodePage, driver, 30);
		IntegrationCodePage.click();

	}

	public void goToSystemStatusPage() throws InterruptedException {
		Utilities.waitForElement(UtilitiesModule, driver, 30);
		UtilitiesModule.click();
		Utilities.waitForElement(SystemStatusPage, driver, 30);
		SystemStatusPage.click();

	}

	// Appearance Page
	public void goToUserInterfacePage() throws InterruptedException {
		Utilities.waitForElement(AppearanceModule, driver, 30);
		AppearanceModule.click();
		Utilities.waitForElement(UserInterfacePage, driver, 30);
		UserInterfacePage.click();

	}

	public void goToCustomizePage() throws InterruptedException {
		Utilities.waitForElement(AppearanceModule, driver, 30);
		AppearanceModule.click();
		Utilities.waitForElement(CustomizePage, driver, 30);
		CustomizePage.click();

	}

	public void goToEditorPage() throws InterruptedException {
		Utilities.waitForElement(AppearanceModule, driver, 30);
		AppearanceModule.click();
		Utilities.waitForElement(EditorPage, driver, 30);
		EditorPage.click();

	}

	public void goToThemesPage() throws InterruptedException {
		Utilities.waitForElement(AppearanceModule, driver, 30);
		AppearanceModule.click();
		Utilities.waitForElement(ThemesPage, driver, 30);
		ThemesPage.click();

	}

	// Plugins Page
	public void goToPluginsPage() throws InterruptedException {
		Utilities.waitForElement(PluginsPage, driver, 30);
		PluginsPage.click();
	}

	// Settings Page
	public void goToGeneralSettingsPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(GeneralSettingsPage, driver, 30);
		GeneralSettingsPage.click();

	}

	public void goToStaffPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(StaffPage, driver, 30);
		StaffPage.click();

	}

	public void goToRolesPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(RolesPage, driver, 30);
		RolesPage.click();

	}

	public void goToLocalizationPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(LocalizationPage, driver, 30);
		LocalizationPage.click();

	}

	public void goToCurrenciesPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(CurrenciesPage, driver, 30);
		CurrenciesPage.click();

	}

	public void goToPaymentGatewaysPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(PaymentGatewaysPage, driver, 30);
		PaymentGatewaysPage.click();

	}

	public void goToExpenseCategoriesPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(ExpenseCategoriesPage, driver, 30);
		ExpenseCategoriesPage.click();

	}

	public void goToIncomeCategoriesPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(IncomeCategoriesPage, driver, 30);
		IncomeCategoriesPage.click();

	}

	public void goToManageTagsPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(ManageTagsPage, driver, 30);
		ManageTagsPage.click();

	}

	public void goToPaymentMethodsPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(PaymentMethodsPage, driver, 30);
		PaymentMethodsPage.click();

	}

	public void goToSalesTaxesPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(SalesTaxesPage, driver, 30);
		SalesTaxesPage.click();

	}

	public void goToEmailSettingsPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(EmailSettingsPage, driver, 30);
		EmailSettingsPage.click();

	}

	public void goToEmailTemplatesPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(EmailTemplatesPage, driver, 30);
		EmailTemplatesPage.click();

	}

	public void goToCustomContactFieldsPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(CustomContactFieldsPage, driver, 30);
		CustomContactFieldsPage.click();

	}

	public void goToAutomationSettingsPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(AutomationSettingsPage, driver, 30);
		AutomationSettingsPage.click();

	}

	public void goToAPIAccessPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(APIAccessPage, driver, 30);
		APIAccessPage.click();

	}

	public void goToChooseFeaturesPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(ChooseFeaturesPage, driver, 30);
		ChooseFeaturesPage.click();

	}

	public void goToAboutPage() throws InterruptedException {
		Utilities.waitForElement(SettingsModule, driver, 30);
		SettingsModule.click();
		Utilities.waitForElement(AboutPage, driver, 30);
		AboutPage.click();

	}
	public void clickOnInvoicesPageWithoutClickingOnSalesModule() throws InterruptedException 
	{
		Utilities.threadsleep(5000);
		InvoicesPageWthoutClickingOnModules.click();
		
	}
}
